// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationRuleCapacitiesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. If the response is truncated, use this token in your next request to retrieve the next page of results. If this parameter is empty, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of security capabilities that are associated with the normalization rules.</p>
     */
    @NameInMap("NormalizationRuleCapacities")
    public java.util.List<ListNormalizationRuleCapacitiesResponseBodyNormalizationRuleCapacities> normalizationRuleCapacities;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListNormalizationRuleCapacitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationRuleCapacitiesResponseBody self = new ListNormalizationRuleCapacitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNormalizationRuleCapacitiesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNormalizationRuleCapacitiesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNormalizationRuleCapacitiesResponseBody setNormalizationRuleCapacities(java.util.List<ListNormalizationRuleCapacitiesResponseBodyNormalizationRuleCapacities> normalizationRuleCapacities) {
        this.normalizationRuleCapacities = normalizationRuleCapacities;
        return this;
    }
    public java.util.List<ListNormalizationRuleCapacitiesResponseBodyNormalizationRuleCapacities> getNormalizationRuleCapacities() {
        return this.normalizationRuleCapacities;
    }

    public ListNormalizationRuleCapacitiesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNormalizationRuleCapacitiesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNormalizationRuleCapacitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNormalizationRuleCapacitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListNormalizationRuleCapacitiesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListNormalizationRuleCapacitiesResponseBodyNormalizationRuleCapacities extends TeaModel {
        /**
         * <p>The list of security capabilities.</p>
         */
        @NameInMap("Capacities")
        public java.util.List<String> capacities;

        /**
         * <p>The type of the security capability. Valid values:</p>
         * <ul>
         * <li><p>detection_preset_rule: predefined analysis rule.</p>
         * </li>
         * <li><p>detection_custom_rule: custom analysis rule.</p>
         * </li>
         * <li><p>incident_investigation: security event handling.</p>
         * </li>
         * <li><p>soar_playbooks: predefined playbook.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>detection_preset_rule</p>
         */
        @NameInMap("CapacityType")
        public String capacityType;

        /**
         * <p>The ID of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>nr-z0b2ssjteut85uoh9nzp</p>
         */
        @NameInMap("NormalizationRuleId")
        public String normalizationRuleId;

        public static ListNormalizationRuleCapacitiesResponseBodyNormalizationRuleCapacities build(java.util.Map<String, ?> map) throws Exception {
            ListNormalizationRuleCapacitiesResponseBodyNormalizationRuleCapacities self = new ListNormalizationRuleCapacitiesResponseBodyNormalizationRuleCapacities();
            return TeaModel.build(map, self);
        }

        public ListNormalizationRuleCapacitiesResponseBodyNormalizationRuleCapacities setCapacities(java.util.List<String> capacities) {
            this.capacities = capacities;
            return this;
        }
        public java.util.List<String> getCapacities() {
            return this.capacities;
        }

        public ListNormalizationRuleCapacitiesResponseBodyNormalizationRuleCapacities setCapacityType(String capacityType) {
            this.capacityType = capacityType;
            return this;
        }
        public String getCapacityType() {
            return this.capacityType;
        }

        public ListNormalizationRuleCapacitiesResponseBodyNormalizationRuleCapacities setNormalizationRuleId(String normalizationRuleId) {
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

    }

}
