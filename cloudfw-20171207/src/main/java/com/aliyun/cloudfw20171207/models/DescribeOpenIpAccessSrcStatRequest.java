// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOpenIpAccessSrcStatRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <strong>example:</strong>
     * <p>47.100.102.XXX</p>
     */
    @NameInMap("DstIp")
    public String dstIp;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>47.100.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeOpenIpAccessSrcStatRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenIpAccessSrcStatRequest self = new DescribeOpenIpAccessSrcStatRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOpenIpAccessSrcStatRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOpenIpAccessSrcStatRequest setDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }
    public String getDstIp() {
        return this.dstIp;
    }

    public DescribeOpenIpAccessSrcStatRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOpenIpAccessSrcStatRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeOpenIpAccessSrcStatRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
