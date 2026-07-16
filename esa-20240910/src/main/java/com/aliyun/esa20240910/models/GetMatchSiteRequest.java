// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetMatchSiteRequest extends TeaModel {
    /**
     * <p>The record name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("RecordName")
    public String recordName;

    public static GetMatchSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMatchSiteRequest self = new GetMatchSiteRequest();
        return TeaModel.build(map, self);
    }

    public GetMatchSiteRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

}
