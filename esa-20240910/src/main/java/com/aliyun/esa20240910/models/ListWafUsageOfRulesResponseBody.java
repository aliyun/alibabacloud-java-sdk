// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafUsageOfRulesResponseBody extends TeaModel {
    /**
     * <p>The number of rules or rule sets for the specified phase under instance-level batch configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BatchConfigUsage")
    public Long batchConfigUsage;

    /**
     * <p>The total number of rules or rule sets for the instance under the specified phase, including both site-level and instance-level rules.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InstanceUsage")
    public Long instanceUsage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of site usage.</p>
     */
    @NameInMap("Sites")
    public java.util.List<ListWafUsageOfRulesResponseBodySites> sites;

    public static ListWafUsageOfRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWafUsageOfRulesResponseBody self = new ListWafUsageOfRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWafUsageOfRulesResponseBody setBatchConfigUsage(Long batchConfigUsage) {
        this.batchConfigUsage = batchConfigUsage;
        return this;
    }
    public Long getBatchConfigUsage() {
        return this.batchConfigUsage;
    }

    public ListWafUsageOfRulesResponseBody setInstanceUsage(Long instanceUsage) {
        this.instanceUsage = instanceUsage;
        return this;
    }
    public Long getInstanceUsage() {
        return this.instanceUsage;
    }

    public ListWafUsageOfRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWafUsageOfRulesResponseBody setSites(java.util.List<ListWafUsageOfRulesResponseBodySites> sites) {
        this.sites = sites;
        return this;
    }
    public java.util.List<ListWafUsageOfRulesResponseBodySites> getSites() {
        return this.sites;
    }

    public static class ListWafUsageOfRulesResponseBodySites extends TeaModel {
        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The site name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of WAF rules or WAF rule sets that have been used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Usage")
        public Long usage;

        public static ListWafUsageOfRulesResponseBodySites build(java.util.Map<String, ?> map) throws Exception {
            ListWafUsageOfRulesResponseBodySites self = new ListWafUsageOfRulesResponseBodySites();
            return TeaModel.build(map, self);
        }

        public ListWafUsageOfRulesResponseBodySites setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWafUsageOfRulesResponseBodySites setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWafUsageOfRulesResponseBodySites setUsage(Long usage) {
            this.usage = usage;
            return this;
        }
        public Long getUsage() {
            return this.usage;
        }

    }

}
