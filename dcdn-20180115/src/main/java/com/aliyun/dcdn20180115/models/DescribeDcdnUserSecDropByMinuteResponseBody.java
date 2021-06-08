// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserSecDropByMinuteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Len")
    public Integer len;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Rows")
    public java.util.List<DescribeDcdnUserSecDropByMinuteResponseBodyRows> rows;

    public static DescribeDcdnUserSecDropByMinuteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserSecDropByMinuteResponseBody self = new DescribeDcdnUserSecDropByMinuteResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserSecDropByMinuteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnUserSecDropByMinuteResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDcdnUserSecDropByMinuteResponseBody setLen(Integer len) {
        this.len = len;
        return this;
    }
    public Integer getLen() {
        return this.len;
    }

    public DescribeDcdnUserSecDropByMinuteResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnUserSecDropByMinuteResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnUserSecDropByMinuteResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDcdnUserSecDropByMinuteResponseBody setRows(java.util.List<DescribeDcdnUserSecDropByMinuteResponseBodyRows> rows) {
        this.rows = rows;
        return this;
    }
    public java.util.List<DescribeDcdnUserSecDropByMinuteResponseBodyRows> getRows() {
        return this.rows;
    }

    public static class DescribeDcdnUserSecDropByMinuteResponseBodyRows extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("TmStr")
        public String tmStr;

        @NameInMap("Drops")
        public Integer drops;

        @NameInMap("Object")
        public String object;

        @NameInMap("SecFunc")
        public String secFunc;

        @NameInMap("RuleName")
        public String ruleName;

        public static DescribeDcdnUserSecDropByMinuteResponseBodyRows build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserSecDropByMinuteResponseBodyRows self = new DescribeDcdnUserSecDropByMinuteResponseBodyRows();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserSecDropByMinuteResponseBodyRows setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDcdnUserSecDropByMinuteResponseBodyRows setTmStr(String tmStr) {
            this.tmStr = tmStr;
            return this;
        }
        public String getTmStr() {
            return this.tmStr;
        }

        public DescribeDcdnUserSecDropByMinuteResponseBodyRows setDrops(Integer drops) {
            this.drops = drops;
            return this;
        }
        public Integer getDrops() {
            return this.drops;
        }

        public DescribeDcdnUserSecDropByMinuteResponseBodyRows setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public DescribeDcdnUserSecDropByMinuteResponseBodyRows setSecFunc(String secFunc) {
            this.secFunc = secFunc;
            return this;
        }
        public String getSecFunc() {
            return this.secFunc;
        }

        public DescribeDcdnUserSecDropByMinuteResponseBodyRows setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
