// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroupPromInstance extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance, such as rw-xxxxxxxxxx.</p>
     * 
     * <strong>example:</strong>
     * <p>prom-12345</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The source of the instance. Valid values:</p>
     * <ul>
     * <li>system: The system automatically identifies the instance based on the workspace or UModel.</li>
     * <li>custom: The user manually selects the instance in the console.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prometheus</p>
     */
    @NameInMap("kind")
    public String kind;

    /**
     * <p>The region where the Prometheus instance resides. If left empty, the backend automatically populates it with the region of the workspace to which the observation group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The time when the record is written or selected, in the yyyy-MM-dd HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-15 10:30:00</p>
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
