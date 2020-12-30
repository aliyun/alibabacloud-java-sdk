// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class GetAccessAttributeResponseBody extends TeaModel {
    @NameInMap("EnableOpenAccess")
    public String enableOpenAccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("OpenUri")
    public String openUri;

    public static GetAccessAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessAttributeResponseBody self = new GetAccessAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessAttributeResponseBody setEnableOpenAccess(String enableOpenAccess) {
        this.enableOpenAccess = enableOpenAccess;
        return this;
    }
    public String getEnableOpenAccess() {
        return this.enableOpenAccess;
    }

    public GetAccessAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccessAttributeResponseBody setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public GetAccessAttributeResponseBody setOpenUri(String openUri) {
        this.openUri = openUri;
        return this;
    }
    public String getOpenUri() {
        return this.openUri;
    }

}
