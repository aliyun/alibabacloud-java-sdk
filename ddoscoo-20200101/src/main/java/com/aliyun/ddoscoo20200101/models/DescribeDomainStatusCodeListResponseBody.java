// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainStatusCodeListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3B63C0DD-8AC5-44B2-95D6-064CA9296B9C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics on response status codes.</p>
     */
    @NameInMap("StatusCodeList")
    public java.util.List<DescribeDomainStatusCodeListResponseBodyStatusCodeList> statusCodeList;

    public static DescribeDomainStatusCodeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatusCodeListResponseBody self = new DescribeDomainStatusCodeListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainStatusCodeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainStatusCodeListResponseBody setStatusCodeList(java.util.List<DescribeDomainStatusCodeListResponseBodyStatusCodeList> statusCodeList) {
        this.statusCodeList = statusCodeList;
        return this;
    }
    public java.util.List<DescribeDomainStatusCodeListResponseBodyStatusCodeList> getStatusCodeList() {
        return this.statusCodeList;
    }

    public static class DescribeDomainStatusCodeListResponseBodyStatusCodeList extends TeaModel {
        /**
         * <p>The index number of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The number of 200 status codes.</p>
         * 
         * <strong>example:</strong>
         * <p>15520</p>
         */
        @NameInMap("Status200")
        public Long status200;

        /**
         * <p>The number of 2xx status codes.</p>
         * 
         * <strong>example:</strong>
         * <p>15520</p>
         */
        @NameInMap("Status2XX")
        public Long status2XX;

        /**
         * <p>The number of 3xx status codes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status3XX")
        public Long status3XX;

        /**
         * <p>The number of 403 status codes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status403")
        public Long status403;

        /**
         * <p>The number of 404 status codes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status404")
        public Long status404;

        /**
         * <p>The number of 405 status codes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status405")
        public Long status405;

        /**
         * <p>The number of 4xx status codes.</p>
         * 
         * <strong>example:</strong>
         * <p>4486</p>
         */
        @NameInMap("Status4XX")
        public Long status4XX;

        /**
         * <p>The number of 501 status codes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status501")
        public Long status501;

        /**
         * <p>The number of 502 status codes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status502")
        public Long status502;

        /**
         * <p>The number of 503 status codes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status503")
        public Long status503;

        /**
         * <p>The number of 504 status codes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status504")
        public Long status504;

        /**
         * <p>The number of 5xx status codes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status5XX")
        public Long status5XX;

        /**
         * <p>The time when the data was collected. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1582992000</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DescribeDomainStatusCodeListResponseBodyStatusCodeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainStatusCodeListResponseBodyStatusCodeList self = new DescribeDomainStatusCodeListResponseBodyStatusCodeList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setStatus200(Long status200) {
            this.status200 = status200;
            return this;
        }
        public Long getStatus200() {
            return this.status200;
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setStatus2XX(Long status2XX) {
            this.status2XX = status2XX;
            return this;
        }
        public Long getStatus2XX() {
            return this.status2XX;
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setStatus3XX(Long status3XX) {
            this.status3XX = status3XX;
            return this;
        }
        public Long getStatus3XX() {
            return this.status3XX;
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setStatus403(Long status403) {
            this.status403 = status403;
            return this;
        }
        public Long getStatus403() {
            return this.status403;
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setStatus404(Long status404) {
            this.status404 = status404;
            return this;
        }
        public Long getStatus404() {
            return this.status404;
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setStatus405(Long status405) {
            this.status405 = status405;
            return this;
        }
        public Long getStatus405() {
            return this.status405;
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setStatus4XX(Long status4XX) {
            this.status4XX = status4XX;
            return this;
        }
        public Long getStatus4XX() {
            return this.status4XX;
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setStatus501(Long status501) {
            this.status501 = status501;
            return this;
        }
        public Long getStatus501() {
            return this.status501;
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setStatus502(Long status502) {
            this.status502 = status502;
            return this;
        }
        public Long getStatus502() {
            return this.status502;
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setStatus503(Long status503) {
            this.status503 = status503;
            return this;
        }
        public Long getStatus503() {
            return this.status503;
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setStatus504(Long status504) {
            this.status504 = status504;
            return this;
        }
        public Long getStatus504() {
            return this.status504;
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setStatus5XX(Long status5XX) {
            this.status5XX = status5XX;
            return this;
        }
        public Long getStatus5XX() {
            return this.status5XX;
        }

        public DescribeDomainStatusCodeListResponseBodyStatusCodeList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
