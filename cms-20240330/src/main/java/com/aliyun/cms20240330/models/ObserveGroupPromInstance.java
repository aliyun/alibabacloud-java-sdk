// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroupPromInstance extends TeaModel {
    /**
     * <p>The ID of the Managed Service for Prometheus instance, such as rw-xxxxxxxxxx.</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The source of the instance. Valid values:</p>
     * <ul>
     * <li>system: The system automatically identifies the instance based on the workspace or UModel.</li>
     * <li>custom: The user manually selects the instance in the console.</li>
     * </ul>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>The region where the Managed Service for Prometheus instance resides. If this parameter is left empty, the backend automatically populates the region based on the workspace to which the application group belongs.</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The time when the record was written or selected. Format: yyyy-MM-dd HH:mm:ss.</p>
     */
    @NameInMap("time")
    public String time;

    public static ObserveGroupPromInstance build(java.util.Map<String, ?> map) throws Exception {
        ObserveGroupPromInstance self = new ObserveGroupPromInstance();
        return TeaModel.build(map, self);
    }

    public ObserveGroupPromInstance setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ObserveGroupPromInstance setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public ObserveGroupPromInstance setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ObserveGroupPromInstance setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
