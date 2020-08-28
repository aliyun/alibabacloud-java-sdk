// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeFolderListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Resource")
    @Validation(required = true)
    public DescribeFolderListResponseResource resource;

    public static DescribeFolderListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFolderListResponse self = new DescribeFolderListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeFolderListResponseResource extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("ServiceId")
        @Validation(required = true)
        public Long serviceId;

        public static DescribeFolderListResponseResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeFolderListResponseResource self = new DescribeFolderListResponseResource();
            return TeaModel.build(map, self);
        }

    }

}
