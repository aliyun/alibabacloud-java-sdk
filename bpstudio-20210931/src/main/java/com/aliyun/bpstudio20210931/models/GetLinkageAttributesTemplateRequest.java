// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetLinkageAttributesTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AreaId")
    public String areaId;

    @NameInMap("Instances")
    public java.util.List<GetLinkageAttributesTemplateRequestInstances> instances;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>${instance_type}</p>
     */
    @NameInMap("TargetVariable")
    public String targetVariable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>XFKR6WYRVS24S07R</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Variables")
    public java.util.Map<String, ?> variables;

    public static GetLinkageAttributesTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkageAttributesTemplateRequest self = new GetLinkageAttributesTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkageAttributesTemplateRequest setAreaId(String areaId) {
        this.areaId = areaId;
        return this;
    }
    public String getAreaId() {
        return this.areaId;
    }

    public GetLinkageAttributesTemplateRequest setInstances(java.util.List<GetLinkageAttributesTemplateRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<GetLinkageAttributesTemplateRequestInstances> getInstances() {
        return this.instances;
    }

    public GetLinkageAttributesTemplateRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public GetLinkageAttributesTemplateRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetLinkageAttributesTemplateRequest setTargetVariable(String targetVariable) {
        this.targetVariable = targetVariable;
        return this;
    }
    public String getTargetVariable() {
        return this.targetVariable;
    }

    public GetLinkageAttributesTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetLinkageAttributesTemplateRequest setVariables(java.util.Map<String, ?> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, ?> getVariables() {
        return this.variables;
    }

    public static class GetLinkageAttributesTemplateRequestInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vpc-<strong>1q56</strong>taq40*****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        public static GetLinkageAttributesTemplateRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            GetLinkageAttributesTemplateRequestInstances self = new GetLinkageAttributesTemplateRequestInstances();
            return TeaModel.build(map, self);
        }

        public GetLinkageAttributesTemplateRequestInstances setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkageAttributesTemplateRequestInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetLinkageAttributesTemplateRequestInstances setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

}
