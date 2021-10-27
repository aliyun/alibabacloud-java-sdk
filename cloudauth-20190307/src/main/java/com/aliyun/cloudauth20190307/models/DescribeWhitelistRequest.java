// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeWhitelistRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("IdCardNum")
    public String idCardNum;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Valid")
    public String valid;

    @NameInMap("ValidEndDate")
    public String validEndDate;

    @NameInMap("ValidStartDate")
    public String validStartDate;

    public static DescribeWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistRequest self = new DescribeWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeWhitelistRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeWhitelistRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWhitelistRequest setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
        return this;
    }
    public String getIdCardNum() {
        return this.idCardNum;
    }

    public DescribeWhitelistRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWhitelistRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhitelistRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeWhitelistRequest setValid(String valid) {
        this.valid = valid;
        return this;
    }
    public String getValid() {
        return this.valid;
    }

    public DescribeWhitelistRequest setValidEndDate(String validEndDate) {
        this.validEndDate = validEndDate;
        return this;
    }
    public String getValidEndDate() {
        return this.validEndDate;
    }

    public DescribeWhitelistRequest setValidStartDate(String validStartDate) {
        this.validStartDate = validStartDate;
        return this;
    }
    public String getValidStartDate() {
        return this.validStartDate;
    }

}
