// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePageDocumentsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>overview</p>
     */
    @NameInMap("PageName")
    public String pageName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yundun</p>
     */
    @NameInMap("SourceCode")
    public String sourceCode;

    /**
     * <strong>example:</strong>
     * <p>223.167.221.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("TabName")
    public String tabName;

    public static DescribePageDocumentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePageDocumentsRequest self = new DescribePageDocumentsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePageDocumentsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePageDocumentsRequest setPageName(String pageName) {
        this.pageName = pageName;
        return this;
    }
    public String getPageName() {
        return this.pageName;
    }

    public DescribePageDocumentsRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    public DescribePageDocumentsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribePageDocumentsRequest setTabName(String tabName) {
        this.tabName = tabName;
        return this;
    }
    public String getTabName() {
        return this.tabName;
    }

}
