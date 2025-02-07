// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCacheTagResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the matching is not case-sensitive. Valid values:</p>
     * <ul>
     * <li>on: The matching is not case-sensitive.</li>
     * <li>off: The matching is case-sensitive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CaseInsensitive")
    public String caseInsensitive;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version number of the website.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <p>The name of the custom cache tag.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("TagName")
    public String tagName;

    public static GetCacheTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCacheTagResponseBody self = new GetCacheTagResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCacheTagResponseBody setCaseInsensitive(String caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
        return this;
    }
    public String getCaseInsensitive() {
        return this.caseInsensitive;
    }

    public GetCacheTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCacheTagResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public GetCacheTagResponseBody setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
