// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetTagsBySwimmingLaneGroupIdRequest extends TeaModel {
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
     * <p>The ID of the lane group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>154</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The name of the Microservices Engine (MSE) namespace that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static GetTagsBySwimmingLaneGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTagsBySwimmingLaneGroupIdRequest self = new GetTagsBySwimmingLaneGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public GetTagsBySwimmingLaneGroupIdRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetTagsBySwimmingLaneGroupIdRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public GetTagsBySwimmingLaneGroupIdRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
