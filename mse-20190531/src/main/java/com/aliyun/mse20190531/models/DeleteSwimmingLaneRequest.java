// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteSwimmingLaneRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the lane.</p>
     */
    @NameInMap("LaneId")
    public Long laneId;

    /**
     * <p>The name of the Microservices Engine (MSE) namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static DeleteSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimmingLaneRequest self = new DeleteSwimmingLaneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSwimmingLaneRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteSwimmingLaneRequest setLaneId(Long laneId) {
        this.laneId = laneId;
        return this;
    }
    public Long getLaneId() {
        return this.laneId;
    }

    public DeleteSwimmingLaneRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
