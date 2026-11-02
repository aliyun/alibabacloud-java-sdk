// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListDNADBResponseBody extends TeaModel {
    /**
     * <p>The list of media fingerprint libraries.</p>
     */
    @NameInMap("DBList")
    public java.util.List<ListDNADBResponseBodyDBList> DBList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDNADBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDNADBResponseBody self = new ListDNADBResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDNADBResponseBody setDBList(java.util.List<ListDNADBResponseBodyDBList> DBList) {
        this.DBList = DBList;
        return this;
    }
    public java.util.List<ListDNADBResponseBodyDBList> getDBList() {
        return this.DBList;
    }

    public ListDNADBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDNADBResponseBodyDBList extends TeaModel {
        /**
         * <p>The ID of the media fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e47098a5b665e2a12****</p>
         */
        @NameInMap("DBId")
        public String DBId;

        /**
         * <p>The description of the media fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a video DNA library.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The model of the media fingerprint library. Valid values:</p>
         * <ul>
         * <li><strong>Video</strong>: Video.</li>
         * <li><strong>Audio</strong>: Audio.</li>
         * <li><strong>Image</strong>: Image.</li>
         * <li><strong>Text</strong>: Text. Only supported in the China (Shanghai) region.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Video</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The name of the media fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>example-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the media fingerprint library. Default value: <strong>offline</strong>. <strong>active</strong> indicates that the library is available. Valid values:</p>
         * <ul>
         * <li><strong>offline</strong>: Offline.</li>
         * <li><strong>active</strong>: Online.</li>
         * <li><strong>deleted</strong>: Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDNADBResponseBodyDBList build(java.util.Map<String, ?> map) throws Exception {
            ListDNADBResponseBodyDBList self = new ListDNADBResponseBodyDBList();
            return TeaModel.build(map, self);
        }

        public ListDNADBResponseBodyDBList setDBId(String DBId) {
            this.DBId = DBId;
            return this;
        }
        public String getDBId() {
            return this.DBId;
        }

        public ListDNADBResponseBodyDBList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDNADBResponseBodyDBList setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListDNADBResponseBodyDBList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDNADBResponseBodyDBList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
