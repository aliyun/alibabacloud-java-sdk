// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationCategoryRequest extends TeaModel {
    /**
     * <p>The category ID. Valid values are predefined destination category enumerations (25+ in total), such as TrustedDomain (trusted websites), AliPay (Alipay products), and CDN (CDN services). For the complete list of enumeration values and their semantics, refer to the product documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The destination type. This parameter is required. If this parameter is not specified, ErrorDstType is returned. Valid values:</p>
     * <ul>
     * <li>Domain: domain name.</li>
     * <li>DstIP: IP address.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("DstType")
    public String dstType;

    /**
     * <p>The end time of the query. Specify the value as a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1750818370</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language type of the response message.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>59.82.45.XXX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The start time of the query. Specify the value as a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1749657600</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The fixed category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("TypeId")
    public String typeId;

    public static DescribeOutgoingDestinationCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationCategoryRequest self = new DescribeOutgoingDestinationCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationCategoryRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public DescribeOutgoingDestinationCategoryRequest setDstType(String dstType) {
        this.dstType = dstType;
        return this;
    }
    public String getDstType() {
        return this.dstType;
    }

    public DescribeOutgoingDestinationCategoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOutgoingDestinationCategoryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    @Deprecated
    public DescribeOutgoingDestinationCategoryRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOutgoingDestinationCategoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeOutgoingDestinationCategoryRequest setTypeId(String typeId) {
        this.typeId = typeId;
        return this;
    }
    public String getTypeId() {
        return this.typeId;
    }

}
