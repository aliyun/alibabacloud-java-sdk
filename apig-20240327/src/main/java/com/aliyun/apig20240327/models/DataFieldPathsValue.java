// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DataFieldPathsValue extends TeaModel {
    /**
     * <p>The identifier key of the template field, such as input_token.</p>
     * 
     * <strong>example:</strong>
     * <p>input_token</p>
     */
    @NameInMap("fieldKey")
    public String fieldKey;

    /**
     * <p>The JSONPath expression of the template field in the request or response message, such as usage.prompt_tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>usage.prompt_tokens</p>
     */
    @NameInMap("jsonPath")
    public String jsonPath;

    /**
     * <p>The value source of the field, which indicates the part of the message from which the field is read, such as response_body.</p>
     * 
     * <strong>example:</strong>
     * <p>response_body</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The statistical category to which the field belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>usage</p>
     */
    @NameInMap("category")
    public String category;

    public static DataFieldPathsValue build(java.util.Map<String, ?> map) throws Exception {
        DataFieldPathsValue self = new DataFieldPathsValue();
        return TeaModel.build(map, self);
    }

    public DataFieldPathsValue setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }
    public String getFieldKey() {
        return this.fieldKey;
    }

    public DataFieldPathsValue setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
        return this;
    }
    public String getJsonPath() {
        return this.jsonPath;
    }

    public DataFieldPathsValue setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DataFieldPathsValue setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

}
