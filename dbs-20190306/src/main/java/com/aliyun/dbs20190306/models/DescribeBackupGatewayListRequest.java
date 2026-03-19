// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupGatewayListRequest extends TeaModel {
    /**
     * <p>A client token used to ensure the idempotence of the request. This prevents duplicate requests.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The unique identifier of the backup gateway. You can query multiple gateways by separating the identifiers with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>7213527653217</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The page number. The value must be greater than or equal to 0 and cannot exceed the maximum value of an integer. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of records on each page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong></p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The default value is 30.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region of the DBS instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: China (Hangzhou)</p>
     * </li>
     * <li><p><strong>cn-shanghai</strong>: China (Shanghai)</p>
     * </li>
     * <li><p><strong>cn-qingdao</strong>: China (Qingdao)</p>
     * </li>
     * <li><p><strong>cn-beijing</strong>: China (Beijing)</p>
     * </li>
     * <li><p><strong>cn-shenzhen</strong>: China (Shenzhen)</p>
     * </li>
     * <li><p><strong>cn-hongkong</strong>: China (Hong Kong)</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: Singapore</p>
     * </li>
     * <li><p><strong>cn-hangzhou-finance</strong>: Hangzhou Finance Cloud</p>
     * </li>
     * <li><p><strong>cn-shanghai-finance</strong>: Shanghai Finance Cloud</p>
     * </li>
     * <li><p><strong>cn-shenzhen-finance</strong>: Shenzhen Finance Cloud</p>
     * </li>
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
