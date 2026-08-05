// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetKnowledgeRecallRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp19aaaaaa****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The question for knowledge base recall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>What are the reports for the clothing category this month?</p>
     */
    @NameInMap("Question")
    public String question;

    /**
     * <p>The top K number of related files to recall.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Topk")
    public Integer topk;

    /**
     * <p>The username. Only files that this user has permission to access are recalled.</p>
     */
    @NameInMap("User")
    public String user;

    public static GetKnowledgeRecallRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeRecallRequest self = new GetKnowledgeRecallRequest();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeRecallRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetKnowledgeRecallRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public GetKnowledgeRecallRequest setTopk(Integer topk) {
        this.topk = topk;
        return this;
    }
    public Integer getTopk() {
        return this.topk;
    }

    public GetKnowledgeRecallRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
