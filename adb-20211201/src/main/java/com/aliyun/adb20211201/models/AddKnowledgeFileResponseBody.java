// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AddKnowledgeFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the imported file.</p>
     * 
     * <strong>example:</strong>
     * <p>2059412857631539200</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The location of the imported file.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket_name/path/to/file</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddKnowledgeFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddKnowledgeFileResponseBody self = new AddKnowledgeFileResponseBody();
        return TeaModel.build(map, self);
    }

    public AddKnowledgeFileResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AddKnowledgeFileResponseBody setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public AddKnowledgeFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
