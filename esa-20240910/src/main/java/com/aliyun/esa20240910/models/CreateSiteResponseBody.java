// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ns1.example.com,ns2.example.com</p>
     */
    @NameInMap("NameServerList")
    public String nameServerList;

    /**
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-3C82-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>verify_aah9dioasmov****</p>
     */
    @NameInMap("VerifyCode")
    public String verifyCode;

    public static CreateSiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteResponseBody self = new CreateSiteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSiteResponseBody setNameServerList(String nameServerList) {
        this.nameServerList = nameServerList;
        return this;
    }
    public String getNameServerList() {
        return this.nameServerList;
    }

    public CreateSiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSiteResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateSiteResponseBody setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
