// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineUserInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The routines.</p>
     */
    @NameInMap("Routines")
    public java.util.List<GetRoutineUserInfoResponseBodyRoutines> routines;

    /**
     * <p>The subdomains.</p>
     */
    @NameInMap("Subdomains")
    public java.util.List<String> subdomains;

    public static GetRoutineUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineUserInfoResponseBody self = new GetRoutineUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoutineUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoutineUserInfoResponseBody setRoutines(java.util.List<GetRoutineUserInfoResponseBodyRoutines> routines) {
        this.routines = routines;
        return this;
    }
    public java.util.List<GetRoutineUserInfoResponseBodyRoutines> getRoutines() {
        return this.routines;
    }

    public GetRoutineUserInfoResponseBody setSubdomains(java.util.List<String> subdomains) {
        this.subdomains = subdomains;
        return this;
    }
    public java.util.List<String> getSubdomains() {
        return this.subdomains;
    }

    public static class GetRoutineUserInfoResponseBodyRoutines extends TeaModel {
        /**
         * <p>The time when the routine was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-11T01:23:02.883361712Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The routine description, which is Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWRpdCByb3V0aW5lIGNvbmZpZyBkZXNjcmlwdGlvbg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The routine name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-routine1</p>
         */
        @NameInMap("RoutineName")
        public String routineName;

        public static GetRoutineUserInfoResponseBodyRoutines build(java.util.Map<String, ?> map) throws Exception {
            GetRoutineUserInfoResponseBodyRoutines self = new GetRoutineUserInfoResponseBodyRoutines();
            return TeaModel.build(map, self);
        }

        public GetRoutineUserInfoResponseBodyRoutines setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRoutineUserInfoResponseBodyRoutines setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRoutineUserInfoResponseBodyRoutines setRoutineName(String routineName) {
            this.routineName = routineName;
            return this;
        }
        public String getRoutineName() {
            return this.routineName;
        }

    }

}
