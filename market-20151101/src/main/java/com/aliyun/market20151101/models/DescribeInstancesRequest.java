// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    /**
     * <p>The commodity codes. Separate multiple codes with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cmgj000112,cmgj000113</p>
     */
    @NameInMap("Codes")
    public String codes;

    /**
     * <p>The commodity codes to exclude. This parameter cannot be specified together with the Codes parameter. Separate multiple codes with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cmgj000114,cmgj000115</p>
     */
    @NameInMap("ExceptCodes")
    public String exceptCodes;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The commodity type. Valid values:</p>
     * <ul>
     * <li>APP: application</li>
     * <li>SERVICE: service</li>
     * <li>MIRROR: image</li>
     * <li>DOWNLOAD: download</li>
     * <li>API_SERVICE: API</li>
     * <li>ROS: resource orchestration</li>
     * <li>DOCKER: container</li>
     * <li>IOT: IoT.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static DescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesRequest self = new DescribeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesRequest setCodes(String codes) {
        this.codes = codes;
        return this;
    }
    public String getCodes() {
        return this.codes;
    }

    public DescribeInstancesRequest setExceptCodes(String exceptCodes) {
        this.exceptCodes = exceptCodes;
        return this;
    }
    public String getExceptCodes() {
        return this.exceptCodes;
    }

    public DescribeInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
