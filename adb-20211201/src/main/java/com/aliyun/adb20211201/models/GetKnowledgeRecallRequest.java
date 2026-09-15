// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetKnowledgeRecallRequest extends TeaModel {
    /**
     * <p>The ID of the ADB MySQL cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp19aaaaaa****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The file path prefix. Only files that match the specified path prefix are recalled.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucketName/path/prefix/</p>
     */
    @NameInMap("Path")
    public String path;

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
     * <p>The list of tags in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{   &quot;tag_key1&quot;: [&quot;tag_key1_value1&quot;, &quot;tag_key1_value2&quot;],   &quot;tag_key2&quot;: [&quot;tag_key2_value&quot;] }</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The top K associated files to recall.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Topk")
    public Integer topk;

    /**
     * <p>The username. Only files that the specified user has permission to access are recalled.</p>
     * 
     * <strong>example:</strong>
     * <p>user_name1</p>
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

    public GetKnowledgeRecallRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetKnowledgeRecallRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public GetKnowledgeRecallRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
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
