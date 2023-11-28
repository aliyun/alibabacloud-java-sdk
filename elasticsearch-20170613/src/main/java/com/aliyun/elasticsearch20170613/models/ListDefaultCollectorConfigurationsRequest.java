// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDefaultCollectorConfigurationsRequest extends TeaModel {
    /**
     * <p>The shipper type. Valid values:</p>
     * <br>
     * <p>*   fileBeat</p>
     * <p>*   metricBeat</p>
     * <p>*   heartBeat</p>
     * <p>*   auditBeat</p>
     */
    @NameInMap("resType")
    public String resType;

    /**
     * <p>The shipper version. The shipper version varies based on the type of the machine on which the shipper is deployed. Valid values:</p>
     * <br>
     * <p>*   ECS: 6.8.5\_with_community</p>
     * <p>*   ACK: 6.8.13\_with_community</p>
     */
    @NameInMap("resVersion")
    public String resVersion;

    /**
     * <p>The type of the machine on which the shipper is deployed. If you do not configure this parameter, the default configuration files of shippers deployed on all types of machines are returned. Valid values:</p>
     * <br>
     * <p>*   ECS: ECS instance</p>
     * <p>*   ACK: ACK cluster</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    public static ListDefaultCollectorConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDefaultCollectorConfigurationsRequest self = new ListDefaultCollectorConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public ListDefaultCollectorConfigurationsRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public ListDefaultCollectorConfigurationsRequest setResVersion(String resVersion) {
        this.resVersion = resVersion;
        return this;
    }
    public String getResVersion() {
        return this.resVersion;
    }

    public ListDefaultCollectorConfigurationsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
