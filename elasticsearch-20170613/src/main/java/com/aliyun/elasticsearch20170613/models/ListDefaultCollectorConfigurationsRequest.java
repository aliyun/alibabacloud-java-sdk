// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDefaultCollectorConfigurationsRequest extends TeaModel {
    /**
     * <p>The type of the collector. Valid values:</p>
     * <ul>
     * <li>fileBeat</li>
     * <li>metricBeat</li>
     * <li>heartBeat</li>
     * <li>auditBeat.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fileBeat</p>
     */
    @NameInMap("resType")
    public String resType;

    /**
     * <p>The version of the collector. The available versions vary based on the type of machine on which the collector is deployed. Valid values:</p>
     * <ul>
     * <li>ECS: 6.8.5_with_community</li>
     * <li>ACK: 6.8.13_with_community.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6.8.5_with_community</p>
     */
    @NameInMap("resVersion")
    public String resVersion;

    /**
     * <p>The type of machine on which the collector is deployed. If you do not specify this parameter, all types are returned. Valid values:</p>
     * <ul>
     * <li>ECS: Elastic Compute Service (ECS) instance</li>
     * <li>ACK: Container Service for Kubernetes (ACK) cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
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
