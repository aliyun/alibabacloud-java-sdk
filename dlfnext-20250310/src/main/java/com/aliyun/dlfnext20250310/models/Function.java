// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Function extends TeaModel {
    /**
     * <p>The comment information.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1741266704867</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The creator.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    /**
     * <p>The function metadata definitions.</p>
     */
    @NameInMap("definitions")
    public java.util.Map<String, FunctionDefinition> definitions;

    /**
     * <p>Specifies whether the same input always returns the same output.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deterministic")
    public Boolean deterministic;

    /**
     * <p>ID</p>
     * 
     * <strong>example:</strong>
     * <p>db-xxxx</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The field input parameters.</p>
     */
    @NameInMap("inputParams")
    public java.util.List<DataField> inputParams;

    /**
     * <p>The function name.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The extension options.</p>
     */
    @NameInMap("options")
    public java.util.Map<String, String> options;

    /**
     * <p>The owner.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The return fields of the function.</p>
     */
    @NameInMap("returnParams")
    public java.util.List<DataField> returnParams;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>1764556033696</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    /**
     * <p>The updater.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("updatedBy")
    public String updatedBy;

    public static Function build(java.util.Map<String, ?> map) throws Exception {
        Function self = new Function();
        return TeaModel.build(map, self);
    }

    public Function setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Function setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Function setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public Function setDefinitions(java.util.Map<String, FunctionDefinition> definitions) {
        this.definitions = definitions;
        return this;
    }
    public java.util.Map<String, FunctionDefinition> getDefinitions() {
        return this.definitions;
    }

    public Function setDeterministic(Boolean deterministic) {
        this.deterministic = deterministic;
        return this;
    }
    public Boolean getDeterministic() {
        return this.deterministic;
    }

    public Function setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Function setInputParams(java.util.List<DataField> inputParams) {
        this.inputParams = inputParams;
        return this;
    }
    public java.util.List<DataField> getInputParams() {
        return this.inputParams;
    }

    public Function setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Function setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public Function setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public Function setReturnParams(java.util.List<DataField> returnParams) {
        this.returnParams = returnParams;
        return this;
    }
    public java.util.List<DataField> getReturnParams() {
        return this.returnParams;
    }

    public Function setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public Function setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

}
