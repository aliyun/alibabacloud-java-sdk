// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRemediationTemplatesResponseBody extends TeaModel {
    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The queried remediation templates.</p>
     */
    @NameInMap("RemediationTemplates")
    public java.util.List<ListRemediationTemplatesResponseBodyRemediationTemplates> remediationTemplates;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FC2C4750-7024-499C-A69F-763543D1CBE3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of remediation templates.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRemediationTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRemediationTemplatesResponseBody self = new ListRemediationTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRemediationTemplatesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRemediationTemplatesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRemediationTemplatesResponseBody setRemediationTemplates(java.util.List<ListRemediationTemplatesResponseBodyRemediationTemplates> remediationTemplates) {
        this.remediationTemplates = remediationTemplates;
        return this;
    }
    public java.util.List<ListRemediationTemplatesResponseBodyRemediationTemplates> getRemediationTemplates() {
        return this.remediationTemplates;
    }

    public ListRemediationTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRemediationTemplatesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRemediationTemplatesResponseBodyRemediationTemplates extends TeaModel {
        /**
         * <p>The type of the remediation template. Valid value: OOS, which indicates Operation Orchestration Service.</p>
         * 
         * <strong>example:</strong>
         * <p>OOS</p>
         */
        @NameInMap("RemediationType")
        public String remediationType;

        /**
         * <p>The definition of the remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Parameters&quot;: {
         *         &quot;bucketName&quot;: {
         *             &quot;Default&quot;: &quot;{resourceId}&quot;,
         *             &quot;Description&quot;: {
         *                 &quot;zh-cn&quot;: &quot;[Required]OSS Bucket Name.&quot;,
         *                 &quot;en&quot;: &quot;[Required]OSS Bucket Name.&quot;
         *             },
         *             &quot;Type&quot;: &quot;String&quot;
         *         },
         *         &quot;regionId&quot;: {
         *             &quot;AssociationProperty&quot;: &quot;RegionId&quot;,
         *             &quot;Default&quot;: &quot;{regionId}&quot;,
         *             &quot;Description&quot;: {
         *                 &quot;zh-cn&quot;: &quot;[Required]The id of target region.&quot;,
         *                 &quot;en&quot;: &quot;[Required]The id of target region.&quot;
         *             },
         *             &quot;Type&quot;: &quot;String&quot;
         *         },
         *         &quot;permissionName&quot;: {
         *             &quot;AllowValues&quot;: &quot;[\&quot;public-read-write\&quot;,\&quot;public-read\&quot;,\&quot;private\&quot;]&quot;,
         *             &quot;Default&quot;: &quot;private&quot;,
         *             &quot;Description&quot;: {
         *                 &quot;zh-cn&quot;: &quot;[Required]ACL Permission Name.&quot;,
         *                 &quot;en&quot;: &quot;[Required]ACL Permission Name.&quot;
         *             },
         *             &quot;Type&quot;: &quot;String&quot;
         *         }
         *     }
         * }</p>
         */
        @NameInMap("TemplateDefinition")
        public String templateDefinition;

        /**
         * <p>The description of the remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>Configure encryption rules for OSSBucket through the PutBucketEncryption interface. Be aware of the risks and exercise caution.</p>
         */
        @NameInMap("TemplateDescription")
        public String templateDescription;

        /**
         * <p>The ID of the remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-OSS-PutBucketAcl</p>
         */
        @NameInMap("TemplateIdentifier")
        public String templateIdentifier;

        /**
         * <p>The name of the remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>Set the ACL of an OSS bucket to private</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static ListRemediationTemplatesResponseBodyRemediationTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListRemediationTemplatesResponseBodyRemediationTemplates self = new ListRemediationTemplatesResponseBodyRemediationTemplates();
            return TeaModel.build(map, self);
        }

        public ListRemediationTemplatesResponseBodyRemediationTemplates setRemediationType(String remediationType) {
            this.remediationType = remediationType;
            return this;
        }
        public String getRemediationType() {
            return this.remediationType;
        }

        public ListRemediationTemplatesResponseBodyRemediationTemplates setTemplateDefinition(String templateDefinition) {
            this.templateDefinition = templateDefinition;
            return this;
        }
        public String getTemplateDefinition() {
            return this.templateDefinition;
        }

        public ListRemediationTemplatesResponseBodyRemediationTemplates setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public ListRemediationTemplatesResponseBodyRemediationTemplates setTemplateIdentifier(String templateIdentifier) {
            this.templateIdentifier = templateIdentifier;
            return this;
        }
        public String getTemplateIdentifier() {
            return this.templateIdentifier;
        }

        public ListRemediationTemplatesResponseBodyRemediationTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
