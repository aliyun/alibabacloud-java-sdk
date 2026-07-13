// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCustomLinesRequest extends TeaModel {
    /**
     * <p>The language of the request and response. The default value is <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The unique IDs of the custom lines. Separate multiple IDs with commas (,). To obtain the unique IDs, call the <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describecustomlines?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeCustomLines</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1*******,2*********</p>
     */
    @NameInMap("LineIds")
    public String lineIds;

    public static DeleteCustomLinesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomLinesRequest self = new DeleteCustomLinesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomLinesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteCustomLinesRequest setLineIds(String lineIds) {
        this.lineIds = lineIds;
        return this;
    }
    public String getLineIds() {
        return this.lineIds;
    }

}
