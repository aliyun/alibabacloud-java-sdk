// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GenerateSqlFromNLRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1***</p>
     */
    @NameInMap("DbId")
    public String dbId;

    /**
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Dialect")
    public String dialect;

    /**
     * <strong>example:</strong>
     * <p>state&gt;0代表成功</p>
     */
    @NameInMap("Knowledge")
    public String knowledge;

    /**
     * <strong>example:</strong>
     * <p>base</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Question")
    public String question;

    public static GenerateSqlFromNLRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateSqlFromNLRequest self = new GenerateSqlFromNLRequest();
        return TeaModel.build(map, self);
    }

    public GenerateSqlFromNLRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public GenerateSqlFromNLRequest setDialect(String dialect) {
        this.dialect = dialect;
        return this;
    }
    public String getDialect() {
        return this.dialect;
    }

    public GenerateSqlFromNLRequest setKnowledge(String knowledge) {
        this.knowledge = knowledge;
        return this;
    }
    public String getKnowledge() {
        return this.knowledge;
    }

    public GenerateSqlFromNLRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GenerateSqlFromNLRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public GenerateSqlFromNLRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

}
