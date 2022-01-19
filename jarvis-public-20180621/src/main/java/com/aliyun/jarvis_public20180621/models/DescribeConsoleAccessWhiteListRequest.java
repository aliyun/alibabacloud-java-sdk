// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeConsoleAccessWhiteListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DstIP")
    public String dstIP;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SourceCode")
    public String sourceCode;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("SrcIP")
    public String srcIP;

    @NameInMap("Status")
    public String status;

    @NameInMap("WhiteListType")
    public Integer whiteListType;

    @NameInMap("queryProduct")
    public String queryProduct;

    public static DescribeConsoleAccessWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsoleAccessWhiteListRequest self = new DescribeConsoleAccessWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConsoleAccessWhiteListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeConsoleAccessWhiteListRequest setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeConsoleAccessWhiteListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeConsoleAccessWhiteListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeConsoleAccessWhiteListRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    public DescribeConsoleAccessWhiteListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeConsoleAccessWhiteListRequest setSrcIP(String srcIP) {
        this.srcIP = srcIP;
        return this;
    }
    public String getSrcIP() {
        return this.srcIP;
    }

    public DescribeConsoleAccessWhiteListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeConsoleAccessWhiteListRequest setWhiteListType(Integer whiteListType) {
        this.whiteListType = whiteListType;
        return this;
    }
    public Integer getWhiteListType() {
        return this.whiteListType;
    }

    public DescribeConsoleAccessWhiteListRequest setQueryProduct(String queryProduct) {
        this.queryProduct = queryProduct;
        return this;
    }
    public String getQueryProduct() {
        return this.queryProduct;
    }

}
