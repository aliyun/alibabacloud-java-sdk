// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class AcknowledgeTaskResultRequest extends TeaModel {
    /**
     * <p>Language of the error message returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese;</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>List of task detail numbers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2659c29493e94416b297a7691340ccc4</p>
     */
    @NameInMap("TaskDetailNo")
    public java.util.List<String> taskDetailNo;

    /**
     * <p>User IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static AcknowledgeTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        AcknowledgeTaskResultRequest self = new AcknowledgeTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public AcknowledgeTaskResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AcknowledgeTaskResultRequest setTaskDetailNo(java.util.List<String> taskDetailNo) {
        this.taskDetailNo = taskDetailNo;
        return this;
    }
    public java.util.List<String> getTaskDetailNo() {
        return this.taskDetailNo;
    }

    public AcknowledgeTaskResultRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
