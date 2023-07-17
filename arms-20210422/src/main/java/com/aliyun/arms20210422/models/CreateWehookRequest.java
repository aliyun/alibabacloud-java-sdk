// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CreateWehookRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("HttpHeaders")
    public String httpHeaders;

    @NameInMap("HttpParams")
    public String httpParams;

    @NameInMap("Method")
    public String method;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Url")
    public String url;

    public static CreateWehookRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWehookRequest self = new CreateWehookRequest();
        return TeaModel.build(map, self);
    }

    public CreateWehookRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateWehookRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateWehookRequest setHttpHeaders(String httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }
    public String getHttpHeaders() {
        return this.httpHeaders;
    }

    public CreateWehookRequest setHttpParams(String httpParams) {
        this.httpParams = httpParams;
        return this;
    }
    public String getHttpParams() {
        return this.httpParams;
    }

    public CreateWehookRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public CreateWehookRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateWehookRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
