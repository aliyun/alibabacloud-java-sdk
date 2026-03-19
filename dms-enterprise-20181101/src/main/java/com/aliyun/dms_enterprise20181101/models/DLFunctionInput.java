// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLFunctionInput extends TeaModel {
    /**
     * <p>The JAVA class that contains the function code.</p>
     * 
     * <strong>example:</strong>
     * <p>com.example.hive.MyCustomUDF</p>
     */
    @NameInMap("ClassName")
    public String className;

    /**
     * <p>The time when the function was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1731586286</p>
     */
    @NameInMap("CreateTime")
    public Integer createTime;

    /**
     * <p>The ID of the user who created the function.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("CreatorId")
    public Long creatorId;

    /**
     * <p>The name of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>my_funciton</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    /**
     * <p>The type of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>JAVA</p>
     */
    @NameInMap("FunctionType")
    public String functionType;

    /**
     * <p>The ID of the user who modified the function.</p>
     * 
     * <strong>example:</strong>
     * <p>26****</p>
     */
    @NameInMap("ModifierId")
    public Long modifierId;

    /**
     * <p>The owner of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("OwnerName")
    public String ownerName;

    /**
     * <p>The type of the owner.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ROLE</li>
     * <li>GROUP</li>
     * <li>USER</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("OwnerType")
    public String ownerType;

    /**
     * <p>The resource URIs of the function. You cannot modify the resource URIs after the function is created.</p>
     */
    @NameInMap("ResourceUris")
    public java.util.List<DLResourceUri> resourceUris;

    public static DLFunctionInput build(java.util.Map<String, ?> map) throws Exception {
        DLFunctionInput self = new DLFunctionInput();
        return TeaModel.build(map, self);
    }

    public DLFunctionInput setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public DLFunctionInput setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public DLFunctionInput setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public DLFunctionInput setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public DLFunctionInput setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public DLFunctionInput setModifierId(Long modifierId) {
        this.modifierId = modifierId;
        return this;
    }
    public Long getModifierId() {
        return this.modifierId;
    }

    public DLFunctionInput setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public DLFunctionInput setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public DLFunctionInput setResourceUris(java.util.List<DLResourceUri> resourceUris) {
        this.resourceUris = resourceUris;
        return this;
    }
    public java.util.List<DLResourceUri> getResourceUris() {
        return this.resourceUris;
    }

}
