// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StatisticsReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("commentNum")
    public Long commentNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("commentUserNum")
    public Long commentUserNum;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("likeNum")
    public Long likeNum;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("readNum")
    public Long readNum;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static StatisticsReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StatisticsReportResponseBody self = new StatisticsReportResponseBody();
        return TeaModel.build(map, self);
    }

    public StatisticsReportResponseBody setCommentNum(Long commentNum) {
        this.commentNum = commentNum;
        return this;
    }
    public Long getCommentNum() {
        return this.commentNum;
    }

    public StatisticsReportResponseBody setCommentUserNum(Long commentUserNum) {
        this.commentUserNum = commentUserNum;
        return this;
    }
    public Long getCommentUserNum() {
        return this.commentUserNum;
    }

    public StatisticsReportResponseBody setLikeNum(Long likeNum) {
        this.likeNum = likeNum;
        return this;
    }
    public Long getLikeNum() {
        return this.likeNum;
    }

    public StatisticsReportResponseBody setReadNum(Long readNum) {
        this.readNum = readNum;
        return this;
    }
    public Long getReadNum() {
        return this.readNum;
    }

    public StatisticsReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
