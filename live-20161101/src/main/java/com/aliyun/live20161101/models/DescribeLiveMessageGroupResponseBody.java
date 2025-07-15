// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveMessageGroupResponseBody extends TeaModel {
    /**
     * <p>The list of the group administrators.</p>
     */
    @NameInMap("AdminList")
    public java.util.List<String> adminList;

    /**
     * <p>The time when the group was created. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1698305471</p>
     */
    @NameInMap("Createtime")
    public Long createtime;

    /**
     * <p>The ID of the group creator.</p>
     * 
     * <strong>example:</strong>
     * <p>uid1</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The time when the group was deleted. This parameter is returned only if the group was deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>1698299827</p>
     */
    @NameInMap("Deletatime")
    public Long deletatime;

    /**
     * <p>Indicates whether the group was deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Delete")
    public Boolean delete;

    /**
     * <p>The ID of the user who deleted the group. This parameter is returned only if the group was deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>uid1</p>
     */
    @NameInMap("Deletor")
    public String deletor;

    /**
     * <p>The group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest1</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Additional information about the group.</p>
     * 
     * <strong>example:</strong>
     * <p>testgroupinfo</p>
     */
    @NameInMap("GroupInfo")
    public String groupInfo;

    /**
     * <p>The name of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>mytestgroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The categorized message statistics. This parameter is returned only if the group exists.</p>
     */
    @NameInMap("MsgAmount")
    public java.util.Map<String, Long> msgAmount;

    /**
     * <p>The number of online users in the group. This parameter is returned only if the group exists.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("OnlineUserCounts")
    public Long onlineUserCounts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1815A27D-BAE2-10E6-89FD-D477951C67C7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the group is a super group. Valid values:</p>
     * <ul>
     * <li>True</li>
     * <li>False</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("SuperLargeGroup")
    public Boolean superLargeGroup;

    /**
     * <p>The total number of sessions. This parameter is returned only if the group exists.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalTimes")
    public Long totalTimes;

    public static DescribeLiveMessageGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveMessageGroupResponseBody self = new DescribeLiveMessageGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveMessageGroupResponseBody setAdminList(java.util.List<String> adminList) {
        this.adminList = adminList;
        return this;
    }
    public java.util.List<String> getAdminList() {
        return this.adminList;
    }

    public DescribeLiveMessageGroupResponseBody setCreatetime(Long createtime) {
        this.createtime = createtime;
        return this;
    }
    public Long getCreatetime() {
        return this.createtime;
    }

    public DescribeLiveMessageGroupResponseBody setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public DescribeLiveMessageGroupResponseBody setDeletatime(Long deletatime) {
        this.deletatime = deletatime;
        return this;
    }
    public Long getDeletatime() {
        return this.deletatime;
    }

    public DescribeLiveMessageGroupResponseBody setDelete(Boolean delete) {
        this.delete = delete;
        return this;
    }
    public Boolean getDelete() {
        return this.delete;
    }

    public DescribeLiveMessageGroupResponseBody setDeletor(String deletor) {
        this.deletor = deletor;
        return this;
    }
    public String getDeletor() {
        return this.deletor;
    }

    public DescribeLiveMessageGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeLiveMessageGroupResponseBody setGroupInfo(String groupInfo) {
        this.groupInfo = groupInfo;
        return this;
    }
    public String getGroupInfo() {
        return this.groupInfo;
    }

    public DescribeLiveMessageGroupResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeLiveMessageGroupResponseBody setMsgAmount(java.util.Map<String, Long> msgAmount) {
        this.msgAmount = msgAmount;
        return this;
    }
    public java.util.Map<String, Long> getMsgAmount() {
        return this.msgAmount;
    }

    public DescribeLiveMessageGroupResponseBody setOnlineUserCounts(Long onlineUserCounts) {
        this.onlineUserCounts = onlineUserCounts;
        return this;
    }
    public Long getOnlineUserCounts() {
        return this.onlineUserCounts;
    }

    public DescribeLiveMessageGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveMessageGroupResponseBody setSuperLargeGroup(Boolean superLargeGroup) {
        this.superLargeGroup = superLargeGroup;
        return this;
    }
    public Boolean getSuperLargeGroup() {
        return this.superLargeGroup;
    }

    public DescribeLiveMessageGroupResponseBody setTotalTimes(Long totalTimes) {
        this.totalTimes = totalTimes;
        return this;
    }
    public Long getTotalTimes() {
        return this.totalTimes;
    }

}
