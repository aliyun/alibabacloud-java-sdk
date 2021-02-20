// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainStatusCodeCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status501")
    public Long status501;

    @NameInMap("Status502")
    public Long status502;

    @NameInMap("Status403")
    public Long status403;

    @NameInMap("Status503")
    public Long status503;

    @NameInMap("Status404")
    public Long status404;

    @NameInMap("Status405")
    public Long status405;

    @NameInMap("Status504")
    public Long status504;

    @NameInMap("Status2XX")
    public Long status2XX;

    @NameInMap("Status200")
    public Long status200;

    @NameInMap("Status3XX")
    public Long status3XX;

    @NameInMap("Status4XX")
    public Long status4XX;

    @NameInMap("Status5XX")
    public Long status5XX;

    public static DescribeDomainStatusCodeCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatusCodeCountResponseBody self = new DescribeDomainStatusCodeCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainStatusCodeCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainStatusCodeCountResponseBody setStatus501(Long status501) {
        this.status501 = status501;
        return this;
    }
    public Long getStatus501() {
        return this.status501;
    }

    public DescribeDomainStatusCodeCountResponseBody setStatus502(Long status502) {
        this.status502 = status502;
        return this;
    }
    public Long getStatus502() {
        return this.status502;
    }

    public DescribeDomainStatusCodeCountResponseBody setStatus403(Long status403) {
        this.status403 = status403;
        return this;
    }
    public Long getStatus403() {
        return this.status403;
    }

    public DescribeDomainStatusCodeCountResponseBody setStatus503(Long status503) {
        this.status503 = status503;
        return this;
    }
    public Long getStatus503() {
        return this.status503;
    }

    public DescribeDomainStatusCodeCountResponseBody setStatus404(Long status404) {
        this.status404 = status404;
        return this;
    }
    public Long getStatus404() {
        return this.status404;
    }

    public DescribeDomainStatusCodeCountResponseBody setStatus405(Long status405) {
        this.status405 = status405;
        return this;
    }
    public Long getStatus405() {
        return this.status405;
    }

    public DescribeDomainStatusCodeCountResponseBody setStatus504(Long status504) {
        this.status504 = status504;
        return this;
    }
    public Long getStatus504() {
        return this.status504;
    }

    public DescribeDomainStatusCodeCountResponseBody setStatus2XX(Long status2XX) {
        this.status2XX = status2XX;
        return this;
    }
    public Long getStatus2XX() {
        return this.status2XX;
    }

    public DescribeDomainStatusCodeCountResponseBody setStatus200(Long status200) {
        this.status200 = status200;
        return this;
    }
    public Long getStatus200() {
        return this.status200;
    }

    public DescribeDomainStatusCodeCountResponseBody setStatus3XX(Long status3XX) {
        this.status3XX = status3XX;
        return this;
    }
    public Long getStatus3XX() {
        return this.status3XX;
    }

    public DescribeDomainStatusCodeCountResponseBody setStatus4XX(Long status4XX) {
        this.status4XX = status4XX;
        return this;
    }
    public Long getStatus4XX() {
        return this.status4XX;
    }

    public DescribeDomainStatusCodeCountResponseBody setStatus5XX(Long status5XX) {
        this.status5XX = status5XX;
        return this;
    }
    public Long getStatus5XX() {
        return this.status5XX;
    }

}
