// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RefreshCdnDomainConfigsCacheResponseBody extends TeaModel {
    @NameInMap("SucessDomains")
    public RefreshCdnDomainConfigsCacheResponseBodySucessDomains sucessDomains;

    @NameInMap("FailedDomains")
    public RefreshCdnDomainConfigsCacheResponseBodyFailedDomains failedDomains;

    @NameInMap("RequestId")
    public String requestId;

    public static RefreshCdnDomainConfigsCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshCdnDomainConfigsCacheResponseBody self = new RefreshCdnDomainConfigsCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshCdnDomainConfigsCacheResponseBody setSucessDomains(RefreshCdnDomainConfigsCacheResponseBodySucessDomains sucessDomains) {
        this.sucessDomains = sucessDomains;
        return this;
    }
    public RefreshCdnDomainConfigsCacheResponseBodySucessDomains getSucessDomains() {
        return this.sucessDomains;
    }

    public RefreshCdnDomainConfigsCacheResponseBody setFailedDomains(RefreshCdnDomainConfigsCacheResponseBodyFailedDomains failedDomains) {
        this.failedDomains = failedDomains;
        return this;
    }
    public RefreshCdnDomainConfigsCacheResponseBodyFailedDomains getFailedDomains() {
        return this.failedDomains;
    }

    public RefreshCdnDomainConfigsCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RefreshCdnDomainConfigsCacheResponseBodySucessDomains extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static RefreshCdnDomainConfigsCacheResponseBodySucessDomains build(java.util.Map<String, ?> map) throws Exception {
            RefreshCdnDomainConfigsCacheResponseBodySucessDomains self = new RefreshCdnDomainConfigsCacheResponseBodySucessDomains();
            return TeaModel.build(map, self);
        }

        public RefreshCdnDomainConfigsCacheResponseBodySucessDomains setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class RefreshCdnDomainConfigsCacheResponseBodyFailedDomains extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static RefreshCdnDomainConfigsCacheResponseBodyFailedDomains build(java.util.Map<String, ?> map) throws Exception {
            RefreshCdnDomainConfigsCacheResponseBodyFailedDomains self = new RefreshCdnDomainConfigsCacheResponseBodyFailedDomains();
            return TeaModel.build(map, self);
        }

        public RefreshCdnDomainConfigsCacheResponseBodyFailedDomains setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
