// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class ListImageDbsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListImageDbsResponseData data;

    public static ListImageDbsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageDbsResponse self = new ListImageDbsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListImageDbsResponseDataDbList extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static ListImageDbsResponseDataDbList build(java.util.Map<String, ?> map) throws Exception {
            ListImageDbsResponseDataDbList self = new ListImageDbsResponseDataDbList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListImageDbsResponseData extends TeaModel {
        @NameInMap("DbList")
        @Validation(required = true)
        public java.util.List<ListImageDbsResponseDataDbList> dbList;

        public static ListImageDbsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListImageDbsResponseData self = new ListImageDbsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
