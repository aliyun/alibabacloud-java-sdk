// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserSecDropByMinuteResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The array returned.</p>
     */
    @NameInMap("Len")
    public Integer len;

    /**
     * <p>The domain name.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The beginning of the time range that was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC+0.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The object that triggered the rule.</p>
     */
    @NameInMap("Rows")
    public java.util.List<DescribeDcdnUserSecDropByMinuteResponseBodyRows> rows;

    /**
     * <p>The number of packets blocked within 5 minutes.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDcdnUserSecDropByMinuteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserSecDropByMinuteResponseBody self = new DescribeDcdnUserSecDropByMinuteResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDcdnUserSecDropByMinuteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnUserSecDropByMinuteResponseBody setRows(java.util.List<DescribeDcdnUserSecDropByMinuteResponseBodyRows> rows) {
        this.rows = rows;
        return this;
    }
    public java.util.List<DescribeDcdnUserSecDropByMinuteResponseBodyRows> getRows() {
        return this.rows;
    }

    public DescribeDcdnUserSecDropByMinuteResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnUserSecDropByMinuteResponseBodyRows extends TeaModel {
        /**
         * <p>The security feature that blocked the packets.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>>  The maximum number of times that users can call this operation per second is 50.</p>
         */
        @NameInMap("Drops")
        public Integer drops;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The array returned.</p>
         */
        @NameInMap("SecFunc")
        public String secFunc;

        /**
         * <p>The rule that is triggered.</p>
         */
        @NameInMap("TmStr")
        public String tmStr;

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

        public DescribeDcdnUserSecDropByMinuteResponseBodyRows setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeDcdnUserSecDropByMinuteResponseBodyRows setSecFunc(String secFunc) {
            this.secFunc = secFunc;
            return this;
        }
        public String getSecFunc() {
            return this.secFunc;
        }

        public DescribeDcdnUserSecDropByMinuteResponseBodyRows setTmStr(String tmStr) {
            this.tmStr = tmStr;
            return this;
        }
        public String getTmStr() {
            return this.tmStr;
        }

    }

}
