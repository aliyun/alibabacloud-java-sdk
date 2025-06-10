// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListVideoProcessingsResponseBody extends TeaModel {
    @NameInMap("Configs")
    public java.util.List<ListVideoProcessingsResponseBodyConfigs> configs;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListVideoProcessingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVideoProcessingsResponseBody self = new ListVideoProcessingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVideoProcessingsResponseBody setConfigs(java.util.List<ListVideoProcessingsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListVideoProcessingsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListVideoProcessingsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVideoProcessingsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVideoProcessingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVideoProcessingsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListVideoProcessingsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListVideoProcessingsResponseBodyConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>234123**</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <strong>example:</strong>
         * <p>end</p>
         */
        @NameInMap("FlvSeekEnd")
        public String flvSeekEnd;

        /**
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("FlvSeekStart")
        public String flvSeekStart;

        /**
         * <strong>example:</strong>
         * <p>by_byte</p>
         */
        @NameInMap("FlvVideoSeekMode")
        public String flvVideoSeekMode;

        /**
         * <strong>example:</strong>
         * <p>end</p>
         */
        @NameInMap("Mp4SeekEnd")
        public String mp4SeekEnd;

        /**
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("Mp4SeekStart")
        public String mp4SeekStart;

        /**
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("VideoSeekEnable")
        public String videoSeekEnable;

        public static ListVideoProcessingsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListVideoProcessingsResponseBodyConfigs self = new ListVideoProcessingsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListVideoProcessingsResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListVideoProcessingsResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListVideoProcessingsResponseBodyConfigs setFlvSeekEnd(String flvSeekEnd) {
            this.flvSeekEnd = flvSeekEnd;
            return this;
        }
        public String getFlvSeekEnd() {
            return this.flvSeekEnd;
        }

        public ListVideoProcessingsResponseBodyConfigs setFlvSeekStart(String flvSeekStart) {
            this.flvSeekStart = flvSeekStart;
            return this;
        }
        public String getFlvSeekStart() {
            return this.flvSeekStart;
        }

        public ListVideoProcessingsResponseBodyConfigs setFlvVideoSeekMode(String flvVideoSeekMode) {
            this.flvVideoSeekMode = flvVideoSeekMode;
            return this;
        }
        public String getFlvVideoSeekMode() {
            return this.flvVideoSeekMode;
        }

        public ListVideoProcessingsResponseBodyConfigs setMp4SeekEnd(String mp4SeekEnd) {
            this.mp4SeekEnd = mp4SeekEnd;
            return this;
        }
        public String getMp4SeekEnd() {
            return this.mp4SeekEnd;
        }

        public ListVideoProcessingsResponseBodyConfigs setMp4SeekStart(String mp4SeekStart) {
            this.mp4SeekStart = mp4SeekStart;
            return this;
        }
        public String getMp4SeekStart() {
            return this.mp4SeekStart;
        }

        public ListVideoProcessingsResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListVideoProcessingsResponseBodyConfigs setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListVideoProcessingsResponseBodyConfigs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListVideoProcessingsResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListVideoProcessingsResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        public ListVideoProcessingsResponseBodyConfigs setVideoSeekEnable(String videoSeekEnable) {
            this.videoSeekEnable = videoSeekEnable;
            return this;
        }
        public String getVideoSeekEnable() {
            return this.videoSeekEnable;
        }

    }

}
