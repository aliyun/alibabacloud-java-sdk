// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeChannelParticipantsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6159ba01-6687-4fb2-a831-f0cd8d188648</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time elapsed until the result was returned. Unit: seconds. The value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1557909133</p>
     */
    @NameInMap("Times")
    public Long times;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    /**
     * <p>The list of user IDs.</p>
     */
    @NameInMap("UserList")
    public java.util.List<String> userList;

    public static DescribeChannelParticipantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelParticipantsResponseBody self = new DescribeChannelParticipantsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelParticipantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChannelParticipantsResponseBody setTimes(Long times) {
        this.times = times;
        return this;
    }
    public Long getTimes() {
        return this.times;
    }

    public DescribeChannelParticipantsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeChannelParticipantsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeChannelParticipantsResponseBody setUserList(java.util.List<String> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<String> getUserList() {
        return this.userList;
    }

}
