// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryAllSwimmingLaneRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the lane group.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>MSE命名空间名字</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static QueryAllSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAllSwimmingLaneRequest self = new QueryAllSwimmingLaneRequest();
        return TeaModel.build(map, self);
    }

    public QueryAllSwimmingLaneRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryAllSwimmingLaneRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public QueryAllSwimmingLaneRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
