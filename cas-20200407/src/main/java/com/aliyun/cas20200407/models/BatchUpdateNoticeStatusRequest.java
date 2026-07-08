// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class BatchUpdateNoticeStatusRequest extends TeaModel {
    /**
     * <p>The list of primary key identifiers to be synchronized to Certificate Management Service. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>888</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The language type for the request and the received message. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The business code of message notification. The value is fixed as ssl.</p>
     * 
     * <strong>example:</strong>
     * <p>ssl</p>
     */
    @NameInMap("NoticeBiz")
    public String noticeBiz;

    /**
     * <p>Specifies whether to enable message notification.
     * \--enable: enables message notification.
     * \--disable: disables message notification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("NoticeStatus")
    public String noticeStatus;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>47.98.242.200</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static BatchUpdateNoticeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateNoticeStatusRequest self = new BatchUpdateNoticeStatusRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateNoticeStatusRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public BatchUpdateNoticeStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public BatchUpdateNoticeStatusRequest setNoticeBiz(String noticeBiz) {
        this.noticeBiz = noticeBiz;
        return this;
    }
    public String getNoticeBiz() {
        return this.noticeBiz;
    }

    public BatchUpdateNoticeStatusRequest setNoticeStatus(String noticeStatus) {
        this.noticeStatus = noticeStatus;
        return this;
    }
    public String getNoticeStatus() {
        return this.noticeStatus;
    }

    public BatchUpdateNoticeStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
