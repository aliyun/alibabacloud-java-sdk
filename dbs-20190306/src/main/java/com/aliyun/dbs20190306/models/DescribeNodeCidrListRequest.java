// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeNodeCidrListRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The region in which DBS is activated. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: China (Hangzhou)</li>
     * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
     * <li><strong>cn-qingdao</strong>: China (Qingdao)</li>
     * <li><strong>cn-beijing</strong>: China (Beijing)</li>
     * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
     * <li><strong>cn-hongkong</strong>: China (Hong Kong)</li>
     * <li><strong>ap-southeast-1</strong>: Singapore (Singapore)</li>
     * <li><strong>cn-hangzhou-finance</strong>: China East 1 Finance</li>
     * <li><strong>cn-shanghai-finance</strong>: China East 2 Finance</li>
     * <li><strong>cn-shenzhen-finance</strong>: China South 1 Finance</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    public static DescribeNodeCidrListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeCidrListRequest self = new DescribeNodeCidrListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodeCidrListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeNodeCidrListRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeNodeCidrListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
