// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserUploadFileJobRequest extends TeaModel {
    /**
     * <p>The key of the file upload task. The key is returned when you call the <a href="https://help.aliyun.com/document_detail/206059.html">CreateUploadFileJob</a> or <a href="https://help.aliyun.com/document_detail/206060.html">CreateUploadOSSFileJob</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>65254a49100e</p>
     */
    @NameInMap("JobKey")
    public String jobKey;

    /**
     * <p>The tenant ID.</p>
     * <blockquote>
     * <p>To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetUserUploadFileJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserUploadFileJobRequest self = new GetUserUploadFileJobRequest();
        return TeaModel.build(map, self);
    }

    public GetUserUploadFileJobRequest setJobKey(String jobKey) {
        this.jobKey = jobKey;
        return this;
    }
    public String getJobKey() {
        return this.jobKey;
    }

    public GetUserUploadFileJobRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
