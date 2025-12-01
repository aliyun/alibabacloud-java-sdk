// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupGatewayListRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The unique identifier of the backup gateway. You can query multiple backup gateways. Separate multiple identifiers with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>7213527653217</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of the page to return. The value must be a positive integer. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <blockquote>
     * <p>Default value: 30.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which Database Backup (DBS) is activated. Valid values:</p>
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

    public static DescribeBackupGatewayListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupGatewayListRequest self = new DescribeBackupGatewayListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupGatewayListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeBackupGatewayListRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public DescribeBackupGatewayListRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeBackupGatewayListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeBackupGatewayListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupGatewayListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
