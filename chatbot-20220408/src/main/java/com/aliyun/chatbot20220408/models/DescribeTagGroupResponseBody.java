// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeTagGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>32323</p>
     */
    @NameInMap("CreateUserId")
    public Long createUserId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("CreateUserName")
    public String createUserName;

    /**
     * <strong>example:</strong>
     * <p>232323</p>
     */
    @NameInMap("DefaultTagId")
    public Long defaultTagId;

    /**
     * <strong>example:</strong>
     * <p>标签1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <strong>example:</strong>
     * <p>7393472</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ModifyUserId")
    public Long modifyUserId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ModifyUserName")
    public String modifyUserName;

    /**
     * <strong>example:</strong>
     * <p>xxxXxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTagGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagGroupResponseBody self = new DescribeTagGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagGroupResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeTagGroupResponseBody setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public Long getCreateUserId() {
        return this.createUserId;
    }

    public DescribeTagGroupResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribeTagGroupResponseBody setDefaultTagId(Long defaultTagId) {
        this.defaultTagId = defaultTagId;
        return this;
    }
    public Long getDefaultTagId() {
        return this.defaultTagId;
    }

    public DescribeTagGroupResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeTagGroupResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeTagGroupResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeTagGroupResponseBody setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
        return this;
    }
    public Long getModifyUserId() {
        return this.modifyUserId;
    }

    public DescribeTagGroupResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeTagGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
