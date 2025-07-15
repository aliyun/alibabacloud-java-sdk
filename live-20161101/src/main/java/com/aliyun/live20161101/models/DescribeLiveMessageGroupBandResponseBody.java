// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveMessageGroupBandResponseBody extends TeaModel {
    /**
     * <p>The list of users that were muted separately, but not by muting the entire group.</p>
     */
    @NameInMap("BannedUserList")
    public java.util.List<String> bannedUserList;

    /**
     * <p>The group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Indicates whether all users in the interactive messaging group are muted.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsbannedAll")
    public Boolean isbannedAll;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>021D1FE7-2E87-16AC-9364-4E7EA47C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of users who were not muted when the entire group was muted.</p>
     */
    @NameInMap("UnbannedUserList")
    public java.util.List<String> unbannedUserList;

    public static DescribeLiveMessageGroupBandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveMessageGroupBandResponseBody self = new DescribeLiveMessageGroupBandResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveMessageGroupBandResponseBody setBannedUserList(java.util.List<String> bannedUserList) {
        this.bannedUserList = bannedUserList;
        return this;
    }
    public java.util.List<String> getBannedUserList() {
        return this.bannedUserList;
    }

    public DescribeLiveMessageGroupBandResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeLiveMessageGroupBandResponseBody setIsbannedAll(Boolean isbannedAll) {
        this.isbannedAll = isbannedAll;
        return this;
    }
    public Boolean getIsbannedAll() {
        return this.isbannedAll;
    }

    public DescribeLiveMessageGroupBandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveMessageGroupBandResponseBody setUnbannedUserList(java.util.List<String> unbannedUserList) {
        this.unbannedUserList = unbannedUserList;
        return this;
    }
    public java.util.List<String> getUnbannedUserList() {
        return this.unbannedUserList;
    }

}
