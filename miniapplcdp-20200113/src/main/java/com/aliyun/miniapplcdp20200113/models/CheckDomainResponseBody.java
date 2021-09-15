// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CheckDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CheckDomainResponseBodyData data;

    public static CheckDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainResponseBody self = new CheckDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDomainResponseBody setData(CheckDomainResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckDomainResponseBodyData getData() {
        return this.data;
    }

    public static class CheckDomainResponseBodyData extends TeaModel {
        @NameInMap("Valid")
        public Boolean valid;

        public static CheckDomainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckDomainResponseBodyData self = new CheckDomainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckDomainResponseBodyData setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
