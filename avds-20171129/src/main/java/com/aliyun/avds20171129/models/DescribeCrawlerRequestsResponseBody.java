// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeCrawlerRequestsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Records")
    public java.util.List<DescribeCrawlerRequestsResponseBodyRecords> records;

    public static DescribeCrawlerRequestsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrawlerRequestsResponseBody self = new DescribeCrawlerRequestsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCrawlerRequestsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrawlerRequestsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCrawlerRequestsResponseBody setRecords(java.util.List<DescribeCrawlerRequestsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeCrawlerRequestsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class DescribeCrawlerRequestsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Data")
        public String data;

        @NameInMap("URL")
        public String URL;

        @NameInMap("Method")
        public String method;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Cookies")
        public String cookies;

        public static DescribeCrawlerRequestsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrawlerRequestsResponseBodyRecords self = new DescribeCrawlerRequestsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeCrawlerRequestsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeCrawlerRequestsResponseBodyRecords setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeCrawlerRequestsResponseBodyRecords setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

        public DescribeCrawlerRequestsResponseBodyRecords setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeCrawlerRequestsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public DescribeCrawlerRequestsResponseBodyRecords setCookies(String cookies) {
            this.cookies = cookies;
            return this;
        }
        public String getCookies() {
            return this.cookies;
        }

    }

}
