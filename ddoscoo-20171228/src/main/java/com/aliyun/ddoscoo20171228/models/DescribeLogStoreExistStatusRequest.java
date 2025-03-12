// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLogStoreExistStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeLogStoreExistStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreExistStatusRequest self = new DescribeLogStoreExistStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreExistStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeLogStoreExistStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeLogStoreExistStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
