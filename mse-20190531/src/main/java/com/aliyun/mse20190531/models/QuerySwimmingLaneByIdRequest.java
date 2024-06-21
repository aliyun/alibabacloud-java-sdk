// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySwimmingLaneByIdRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the lane.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>250</p>
     */
    @NameInMap("LaneId")
    public Long laneId;

    /**
     * <p>The name of the Microservices Engine (MSE) namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static QuerySwimmingLaneByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySwimmingLaneByIdRequest self = new QuerySwimmingLaneByIdRequest();
        return TeaModel.build(map, self);
    }

    public QuerySwimmingLaneByIdRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QuerySwimmingLaneByIdRequest setLaneId(Long laneId) {
        this.laneId = laneId;
        return this;
    }
    public Long getLaneId() {
        return this.laneId;
    }

    public QuerySwimmingLaneByIdRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
