// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListJobResponseBody extends TeaModel {
    /**
     * <p>The queried migration tasks.</p>
     */
    @NameInMap("ImportJobList")
    public ListJobResp importJobList;

    public static ListJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobResponseBody self = new ListJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobResponseBody setImportJobList(ListJobResp importJobList) {
        this.importJobList = importJobList;
        return this;
    }
    public ListJobResp getImportJobList() {
        return this.importJobList;
    }

}
