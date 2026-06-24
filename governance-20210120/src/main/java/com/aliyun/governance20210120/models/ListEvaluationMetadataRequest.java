// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationMetadataRequest extends TeaModel {
    @NameInMap("EvaluationDomain")
    public String evaluationDomain;

    /**
     * <p>The language type. Governance evaluation definitions are returned in this language. Valid values:</p>
     * <ul>
     * <li>en: English.</li>
     * <li>zh: Chinese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The specialized evaluation code. Valid values:</p>
     * <ul>
     * <li>basic (default): foundation model (governance maturity) evaluation.</li>
     * <li>ack: container building specialized evaluation.</li>
     * <li>ai: machine learning specialized evaluation.</li>
     * <li>nis: network service specialized evaluation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ack</p>
     */
    @NameInMap("LensCode")
    public String lensCode;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The governance topic code.</p>
     * 
     * <strong>example:</strong>
     * <p>ResourceUtilization</p>
     */
    @NameInMap("TopicCode")
    public String topicCode;

    public static ListEvaluationMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationMetadataRequest self = new ListEvaluationMetadataRequest();
        return TeaModel.build(map, self);
    }

    public ListEvaluationMetadataRequest setEvaluationDomain(String evaluationDomain) {
        this.evaluationDomain = evaluationDomain;
        return this;
    }
    public String getEvaluationDomain() {
        return this.evaluationDomain;
    }

    public ListEvaluationMetadataRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListEvaluationMetadataRequest setLensCode(String lensCode) {
        this.lensCode = lensCode;
        return this;
    }
    public String getLensCode() {
        return this.lensCode;
    }

    public ListEvaluationMetadataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEvaluationMetadataRequest setTopicCode(String topicCode) {
        this.topicCode = topicCode;
        return this;
    }
    public String getTopicCode() {
        return this.topicCode;
    }

}
